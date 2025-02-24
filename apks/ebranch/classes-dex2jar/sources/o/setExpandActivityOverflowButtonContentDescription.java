package o;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import o.setDropDownBackgroundResource;
import o.setPopupTheme;
/* loaded from: classes-dex2jar.jar:o/setExpandActivityOverflowButtonContentDescription.class */
final class setExpandActivityOverflowButtonContentDescription implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, setDropDownBackgroundResource.IconCompatParcelizer {
    setOnDismissListener a;
    private setDropDownBackgroundResource.IconCompatParcelizer b;
    setPopupTheme c;
    setExpandedFormat d;

    public setExpandActivityOverflowButtonContentDescription(setOnDismissListener setondismisslistener) {
        this.a = setondismisslistener;
    }

    @Override // o.setDropDownBackgroundResource.IconCompatParcelizer
    public final void a(setOnDismissListener setondismisslistener, boolean z) {
        setExpandedFormat setexpandedformat;
        if ((z || setondismisslistener == this.a) && (setexpandedformat = this.d) != null) {
            setexpandedformat.dismiss();
        }
        setDropDownBackgroundResource.IconCompatParcelizer iconCompatParcelizer = this.b;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.a(setondismisslistener, z);
        }
    }

    @Override // o.setDropDownBackgroundResource.IconCompatParcelizer
    public final boolean a(setOnDismissListener setondismisslistener) {
        setDropDownBackgroundResource.IconCompatParcelizer iconCompatParcelizer = this.b;
        if (iconCompatParcelizer != null) {
            return iconCompatParcelizer.a(setondismisslistener);
        }
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        setOnDismissListener setondismisslistener = this.a;
        setPopupTheme setpopuptheme = this.c;
        if (setpopuptheme.b == null) {
            setpopuptheme.b = new setPopupTheme.write();
        }
        setondismisslistener.d((setExpandActivityOverflowButtonDrawable) setpopuptheme.b.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.c.e(this.a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.d.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.d.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.a.d(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.a.performShortcut(i, keyEvent, 0);
    }
}
