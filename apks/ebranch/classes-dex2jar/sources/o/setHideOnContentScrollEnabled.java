package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import o.setHasDecor;
/* loaded from: classes-dex2jar.jar:o/setHideOnContentScrollEnabled.class */
public final class setHideOnContentScrollEnabled {
    public Context e;

    public setHideOnContentScrollEnabled(Context context) {
        this.e = context;
    }

    public final int c() {
        Configuration configuration = this.e.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    public final int d() {
        TypedArray obtainStyledAttributes = this.e.obtainStyledAttributes(null, setHasDecor$MediaBrowserCompat$MediaItem.e, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.d, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(setHasDecor$MediaBrowserCompat$MediaItem.m, 0);
        Resources resources = this.e.getResources();
        int i = layoutDimension;
        if (!this.e.getResources().getBoolean(setHasDecor.IconCompatParcelizer.c)) {
            i = Math.min(layoutDimension, resources.getDimensionPixelSize(setHasDecor.write.b));
        }
        obtainStyledAttributes.recycle();
        return i;
    }
}
