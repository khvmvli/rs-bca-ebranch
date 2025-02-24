package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
/* loaded from: classes-dex2jar.jar:o/setImageDrawable.class */
public class setImageDrawable {
    private setImeOptions b;
    private setImeOptions c;
    private setImeOptions e;
    private final View f;
    private int d = -1;
    private final setImageResource a = setImageResource.c();

    public setImageDrawable(View view) {
        this.f = view;
    }

    private boolean b(Drawable drawable) {
        if (this.e == null) {
            this.e = new setImeOptions();
        }
        setImeOptions setimeoptions = this.e;
        setimeoptions.a = null;
        setimeoptions.c = false;
        setimeoptions.d = null;
        setimeoptions.e = false;
        ColorStateList c = findFragmentByWho.c(this.f);
        if (c != null) {
            setimeoptions.c = true;
            setimeoptions.a = c;
        }
        PorterDuff.Mode f = findFragmentByWho.f(this.f);
        if (f != null) {
            setimeoptions.e = true;
            setimeoptions.d = f;
        }
        if (!setimeoptions.c && !setimeoptions.e) {
            return false;
        }
        setImageResource.e(drawable, setimeoptions, this.f.getDrawableState());
        return true;
    }

    private boolean c() {
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i <= 21) {
            return i == 21;
        }
        if (this.c != null) {
            z = true;
        }
        return z;
    }

    public ColorStateList a() {
        setImeOptions setimeoptions = this.b;
        return setimeoptions != null ? setimeoptions.a : null;
    }

    public void a(int i) {
        this.d = i;
        setImageResource setimageresource = this.a;
        a(setimageresource != null ? setimageresource.c(this.f.getContext(), i) : null);
        e();
    }

    void a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.c == null) {
                this.c = new setImeOptions();
            }
            this.c.a = colorStateList;
            this.c.c = true;
        } else {
            this.c = null;
        }
        e();
    }

    public PorterDuff.Mode b() {
        setImeOptions setimeoptions = this.b;
        return setimeoptions != null ? setimeoptions.d : null;
    }

    public void c(AttributeSet attributeSet, int i) {
        Context context = this.f.getContext();
        setIconifiedByDefault seticonifiedbydefault = new setIconifiedByDefault(context, context.obtainStyledAttributes(attributeSet, setHasDecor$MediaBrowserCompat$MediaItem.dW, i, 0));
        View view = this.f;
        findFragmentByWho.e(view, view.getContext(), setHasDecor$MediaBrowserCompat$MediaItem.dW, attributeSet, seticonifiedbydefault.d, i, 0);
        try {
            if (seticonifiedbydefault.d.hasValue(setHasDecor$MediaBrowserCompat$MediaItem.ea)) {
                this.d = seticonifiedbydefault.d.getResourceId(setHasDecor$MediaBrowserCompat$MediaItem.ea, -1);
                ColorStateList c = this.a.c(this.f.getContext(), this.d);
                if (c != null) {
                    a(c);
                }
            }
            if (seticonifiedbydefault.d.hasValue(setHasDecor$MediaBrowserCompat$MediaItem.eb)) {
                findFragmentByWho.e(this.f, seticonifiedbydefault.e(setHasDecor$MediaBrowserCompat$MediaItem.eb));
            }
            if (seticonifiedbydefault.d.hasValue(setHasDecor$MediaBrowserCompat$MediaItem.ec)) {
                findFragmentByWho.b(this.f, setOnFitSystemWindowsListener.e(seticonifiedbydefault.d.getInt(setHasDecor$MediaBrowserCompat$MediaItem.ec, -1), null));
            }
        } finally {
            seticonifiedbydefault.d.recycle();
        }
    }

    public void d(ColorStateList colorStateList) {
        if (this.b == null) {
            this.b = new setImeOptions();
        }
        this.b.a = colorStateList;
        this.b.c = true;
        e();
    }

    public void e() {
        Drawable background = this.f.getBackground();
        if (background == null) {
            return;
        }
        if (!c() || !b(background)) {
            setImeOptions setimeoptions = this.b;
            if (setimeoptions != null) {
                setImageResource.e(background, setimeoptions, this.f.getDrawableState());
                return;
            }
            setImeOptions setimeoptions2 = this.c;
            if (setimeoptions2 != null) {
                setImageResource.e(background, setimeoptions2, this.f.getDrawableState());
            }
        }
    }

    public void e(PorterDuff.Mode mode) {
        if (this.b == null) {
            this.b = new setImeOptions();
        }
        this.b.d = mode;
        this.b.e = true;
        e();
    }

    public void e(Drawable drawable) {
        this.d = -1;
        a((ColorStateList) null);
        e();
    }
}
