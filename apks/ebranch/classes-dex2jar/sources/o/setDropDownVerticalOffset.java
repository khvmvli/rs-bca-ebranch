package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
/* loaded from: classes-dex2jar.jar:o/setDropDownVerticalOffset.class */
public class setDropDownVerticalOffset {
    private setImeOptions a;
    private setImeOptions b;
    private setImeOptions c;
    private final ImageView e;

    public setDropDownVerticalOffset(ImageView imageView) {
        this.e = imageView;
    }

    private boolean b() {
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i <= 21) {
            return i == 21;
        }
        if (this.b != null) {
            z = true;
        }
        return z;
    }

    private boolean c(Drawable drawable) {
        if (this.a == null) {
            this.a = new setImeOptions();
        }
        setImeOptions setimeoptions = this.a;
        setimeoptions.a = null;
        setimeoptions.c = false;
        setimeoptions.d = null;
        setimeoptions.e = false;
        ColorStateList c = getFocusedView.c(this.e);
        if (c != null) {
            setimeoptions.c = true;
            setimeoptions.a = c;
        }
        PorterDuff.Mode d = getFocusedView.d(this.e);
        if (d != null) {
            setimeoptions.e = true;
            setimeoptions.d = d;
        }
        if (!setimeoptions.c && !setimeoptions.e) {
            return false;
        }
        setImageResource.e(drawable, setimeoptions, this.e.getDrawableState());
        return true;
    }

    public void a() {
        Drawable drawable = this.e.getDrawable();
        if (drawable != null) {
            setOnFitSystemWindowsListener.d(drawable);
        }
        if (drawable == null) {
            return;
        }
        if (!b() || !c(drawable)) {
            setImeOptions setimeoptions = this.c;
            if (setimeoptions != null) {
                setImageResource.e(drawable, setimeoptions, this.e.getDrawableState());
                return;
            }
            setImeOptions setimeoptions2 = this.b;
            if (setimeoptions2 != null) {
                setImageResource.e(drawable, setimeoptions2, this.e.getDrawableState());
            }
        }
    }

    public void a(AttributeSet attributeSet, int i) {
        Context context = this.e.getContext();
        setIconifiedByDefault seticonifiedbydefault = new setIconifiedByDefault(context, context.obtainStyledAttributes(attributeSet, setHasDecor$MediaBrowserCompat$MediaItem.V, i, 0));
        ImageView imageView = this.e;
        findFragmentByWho.e(imageView, imageView.getContext(), setHasDecor$MediaBrowserCompat$MediaItem.V, attributeSet, seticonifiedbydefault.d, i, 0);
        try {
            Drawable drawable = this.e.getDrawable();
            Drawable drawable2 = drawable;
            if (drawable == null) {
                int resourceId = seticonifiedbydefault.d.getResourceId(setHasDecor$MediaBrowserCompat$MediaItem.X, -1);
                drawable2 = drawable;
                if (resourceId != -1) {
                    Drawable c = setPrimaryBackground.c(this.e.getContext(), resourceId);
                    drawable2 = c;
                    if (c != null) {
                        this.e.setImageDrawable(c);
                        drawable2 = c;
                    }
                }
            }
            if (drawable2 != null) {
                setOnFitSystemWindowsListener.d(drawable2);
            }
            if (seticonifiedbydefault.d.hasValue(setHasDecor$MediaBrowserCompat$MediaItem.T)) {
                getFocusedView.e(this.e, seticonifiedbydefault.e(setHasDecor$MediaBrowserCompat$MediaItem.T));
            }
            if (seticonifiedbydefault.d.hasValue(setHasDecor$MediaBrowserCompat$MediaItem.W)) {
                getFocusedView.d(this.e, setOnFitSystemWindowsListener.e(seticonifiedbydefault.d.getInt(setHasDecor$MediaBrowserCompat$MediaItem.W, -1), null));
            }
        } finally {
            seticonifiedbydefault.d.recycle();
        }
    }

    public void b(int i) {
        if (i != 0) {
            Drawable c = setPrimaryBackground.c(this.e.getContext(), i);
            if (c != null) {
                setOnFitSystemWindowsListener.d(c);
            }
            this.e.setImageDrawable(c);
        } else {
            this.e.setImageDrawable(null);
        }
        a();
    }

    public void b(PorterDuff.Mode mode) {
        if (this.c == null) {
            this.c = new setImeOptions();
        }
        this.c.d = mode;
        this.c.e = true;
        a();
    }

    public void e(ColorStateList colorStateList) {
        if (this.c == null) {
            this.c = new setImeOptions();
        }
        this.c.a = colorStateList;
        this.c.c = true;
        a();
    }

    public boolean e() {
        return !(this.e.getBackground() instanceof RippleDrawable);
    }
}
