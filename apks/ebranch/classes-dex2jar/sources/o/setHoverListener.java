package o;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow;
import o.setOnDismissListener;
/* loaded from: classes-dex2jar.jar:o/setHoverListener.class */
public final class setHoverListener {
    public final setOnDismissListener a;
    public final Context b;
    public write c;
    final setBackgroundDrawable d;
    private final View e;

    /* loaded from: classes-dex2jar.jar:o/setHoverListener$write.class */
    public interface write {
        boolean a(MenuItem menuItem);
    }

    public setHoverListener(Context context, View view) {
        this(context, view, 0);
    }

    private setHoverListener(Context context, View view, int i) {
        this(context, view, 0, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.J, 0);
    }

    private setHoverListener(Context context, View view, int i, int i2, int i3) {
        this.b = context;
        this.e = view;
        setOnDismissListener setondismisslistener = new setOnDismissListener(context);
        this.a = setondismisslistener;
        setondismisslistener.e(new setOnDismissListener.RemoteActionCompatParcelizer() { // from class: o.setHoverListener.1
            @Override // o.setOnDismissListener.RemoteActionCompatParcelizer
            public final boolean b(setOnDismissListener setondismisslistener2, MenuItem menuItem) {
                if (setHoverListener.this.c != null) {
                    return setHoverListener.this.c.a(menuItem);
                }
                return false;
            }

            @Override // o.setOnDismissListener.RemoteActionCompatParcelizer
            public final void e(setOnDismissListener setondismisslistener2) {
            }
        });
        setBackgroundDrawable setbackgrounddrawable = new setBackgroundDrawable(context, setondismisslistener, view, false, i2, 0);
        this.d = setbackgrounddrawable;
        setbackgrounddrawable.b = i;
        setbackgrounddrawable.a = new PopupWindow.OnDismissListener() { // from class: o.setHoverListener.4
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
            }
        };
    }
}
