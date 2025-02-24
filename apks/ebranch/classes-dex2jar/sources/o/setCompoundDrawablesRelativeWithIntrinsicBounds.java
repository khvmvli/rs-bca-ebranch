package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
/* loaded from: classes-dex2jar.jar:o/setCompoundDrawablesRelativeWithIntrinsicBounds.class */
class setCompoundDrawablesRelativeWithIntrinsicBounds extends PopupWindow {
    private static final boolean b = false;
    private boolean c;

    public setCompoundDrawablesRelativeWithIntrinsicBounds(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c(context, attributeSet, i, 0);
    }

    public setCompoundDrawablesRelativeWithIntrinsicBounds(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        c(context, attributeSet, i, i2);
    }

    private void a(boolean z) {
        if (b) {
            this.c = z;
        } else {
            getLoaderManager.e(this, z);
        }
    }

    private void c(Context context, AttributeSet attributeSet, int i, int i2) {
        setIconifiedByDefault seticonifiedbydefault = new setIconifiedByDefault(context, context.obtainStyledAttributes(attributeSet, setHasDecor$MediaBrowserCompat$MediaItem.cm, i, i2));
        if (seticonifiedbydefault.d.hasValue(setHasDecor$MediaBrowserCompat$MediaItem.cr)) {
            a(seticonifiedbydefault.d.getBoolean(setHasDecor$MediaBrowserCompat$MediaItem.cr, false));
        }
        setBackgroundDrawable(seticonifiedbydefault.d(setHasDecor$MediaBrowserCompat$MediaItem.ck));
        seticonifiedbydefault.d.recycle();
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        int i3 = i2;
        if (b) {
            i3 = i2;
            if (this.c) {
                i3 = i2 - view.getHeight();
            }
        }
        showAsDropDown(view, i, i3);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        int i4 = i2;
        if (b) {
            i4 = i2;
            if (this.c) {
                i4 = i2 - view.getHeight();
            }
        }
        showAsDropDown(view, i, i4, i3);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        int i5 = i2;
        if (b) {
            i5 = i2;
            if (this.c) {
                i5 = i2 - view.getHeight();
            }
        }
        update(view, i, i5, i3, i4);
    }
}
