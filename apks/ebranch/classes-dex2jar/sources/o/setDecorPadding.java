package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import o.inset;
/* loaded from: classes-dex2jar.jar:o/setDecorPadding.class */
public class setDecorPadding {
    private setImeOptions a;
    private setImeOptions b;
    private boolean c;
    private setImeOptions d;
    private final setAllowStacking e;
    private setImeOptions f;
    private setImeOptions g;
    private setImeOptions h;
    private setImeOptions i;
    private Typeface j;

    /* renamed from: o */
    private final TextView f218o;
    private int m = 0;
    private int k = -1;

    public setDecorPadding(TextView textView) {
        this.f218o = textView;
        this.e = new setAllowStacking(textView);
    }

    private void a(int i, float f) {
        this.e.c(i, f);
    }

    private void a(Context context, setIconifiedByDefault seticonifiedbydefault) {
        String string;
        this.m = seticonifiedbydefault.d.getInt(setHasDecor$MediaBrowserCompat$MediaItem.dn, this.m);
        if (Build.VERSION.SDK_INT >= 28) {
            int i = seticonifiedbydefault.d.getInt(setHasDecor$MediaBrowserCompat$MediaItem.dm, -1);
            this.k = i;
            if (i != -1) {
                this.m &= 2;
            }
        }
        boolean z = true;
        if (!seticonifiedbydefault.d.hasValue(setHasDecor$MediaBrowserCompat$MediaItem.di)) {
            if (!seticonifiedbydefault.d.hasValue(setHasDecor$MediaBrowserCompat$MediaItem.dp)) {
                if (seticonifiedbydefault.d.hasValue(setHasDecor$MediaBrowserCompat$MediaItem.f0do)) {
                    this.c = false;
                    int i2 = seticonifiedbydefault.d.getInt(setHasDecor$MediaBrowserCompat$MediaItem.f0do, 1);
                    if (i2 == 1) {
                        this.j = Typeface.SANS_SERIF;
                        return;
                    } else if (i2 == 2) {
                        this.j = Typeface.SERIF;
                        return;
                    } else if (i2 == 3) {
                        this.j = Typeface.MONOSPACE;
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        Typeface typeface = null;
        this.j = null;
        int i3 = seticonifiedbydefault.d.hasValue(setHasDecor$MediaBrowserCompat$MediaItem.dp) ? setHasDecor$MediaBrowserCompat$MediaItem.dp : setHasDecor$MediaBrowserCompat$MediaItem.di;
        final int i4 = this.k;
        final int i5 = this.m;
        if (!context.isRestricted()) {
            final WeakReference weakReference = new WeakReference(this.f218o);
            AnonymousClass1 r0 = new inset.RemoteActionCompatParcelizer() { // from class: o.setDecorPadding.1
                @Override // o.inset.RemoteActionCompatParcelizer
                public void e(int i6) {
                }

                @Override // o.inset.RemoteActionCompatParcelizer
                public void e(Typeface typeface2) {
                    Typeface typeface3 = typeface2;
                    if (Build.VERSION.SDK_INT >= 28) {
                        int i6 = i4;
                        typeface3 = typeface2;
                        if (i6 != -1) {
                            typeface3 = Typeface.create(typeface2, i6, (i5 & 2) != 0);
                        }
                    }
                    setDecorPadding.this.d(weakReference, typeface3);
                }
            };
            try {
                int i6 = this.m;
                int resourceId = seticonifiedbydefault.d.getResourceId(i3, 0);
                if (resourceId != 0) {
                    if (seticonifiedbydefault.c == null) {
                        seticonifiedbydefault.c = new TypedValue();
                    }
                    typeface = inset.c(seticonifiedbydefault.e, resourceId, seticonifiedbydefault.c, i6, r0);
                }
                if (typeface != null) {
                    if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
                        this.j = typeface;
                    } else {
                        this.j = Typeface.create(Typeface.create(typeface, 0), this.k, (this.m & 2) != 0);
                    }
                }
                this.c = this.j == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException e) {
            }
        }
        if (this.j == null && (string = seticonifiedbydefault.d.getString(i3)) != null) {
            if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
                this.j = Typeface.create(string, this.m);
                return;
            }
            Typeface create = Typeface.create(string, 0);
            int i7 = this.k;
            if ((this.m & 2) == 0) {
                z = false;
            }
            this.j = Typeface.create(create, i7, z);
        }
    }

    private static setImeOptions d(Context context, setImageResource setimageresource, int i) {
        ColorStateList c = setimageresource.c(context, i);
        if (c == null) {
            return null;
        }
        setImeOptions setimeoptions = new setImeOptions();
        setimeoptions.c = true;
        setimeoptions.a = c;
        return setimeoptions;
    }

    private void d(Drawable drawable, setImeOptions setimeoptions) {
        if (drawable != null && setimeoptions != null) {
            setImageResource.e(drawable, setimeoptions, this.f218o.getDrawableState());
        }
    }

    private void e(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f218o.getCompoundDrawablesRelative();
            TextView textView = this.f218o;
            Drawable drawable7 = drawable5;
            if (drawable5 == null) {
                drawable7 = compoundDrawablesRelative[0];
            }
            Drawable drawable8 = drawable2;
            if (drawable2 == null) {
                drawable8 = compoundDrawablesRelative[1];
            }
            Drawable drawable9 = drawable6;
            if (drawable6 == null) {
                drawable9 = compoundDrawablesRelative[2];
            }
            Drawable drawable10 = drawable4;
            if (drawable4 == null) {
                drawable10 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable8, drawable9, drawable10);
        } else if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
            Drawable[] compoundDrawablesRelative2 = this.f218o.getCompoundDrawablesRelative();
            Drawable drawable11 = compoundDrawablesRelative2[0];
            if (drawable11 == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = this.f218o.getCompoundDrawables();
                TextView textView2 = this.f218o;
                Drawable drawable12 = drawable;
                if (drawable == null) {
                    drawable12 = compoundDrawables[0];
                }
                Drawable drawable13 = drawable2;
                if (drawable2 == null) {
                    drawable13 = compoundDrawables[1];
                }
                Drawable drawable14 = drawable3;
                if (drawable3 == null) {
                    drawable14 = compoundDrawables[2];
                }
                Drawable drawable15 = drawable4;
                if (drawable4 == null) {
                    drawable15 = compoundDrawables[3];
                }
                textView2.setCompoundDrawablesWithIntrinsicBounds(drawable12, drawable13, drawable14, drawable15);
                return;
            }
            TextView textView3 = this.f218o;
            Drawable drawable16 = drawable2;
            if (drawable2 == null) {
                drawable16 = compoundDrawablesRelative2[1];
            }
            Drawable drawable17 = compoundDrawablesRelative2[2];
            Drawable drawable18 = drawable4;
            if (drawable4 == null) {
                drawable18 = compoundDrawablesRelative2[3];
            }
            textView3.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable11, drawable16, drawable17, drawable18);
        }
    }

    private void j() {
        setImeOptions setimeoptions = this.i;
        this.d = setimeoptions;
        this.f = setimeoptions;
        this.g = setimeoptions;
        this.b = setimeoptions;
        this.h = setimeoptions;
        this.a = setimeoptions;
    }

    public int a() {
        return this.e.d();
    }

    public void a(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT < 30 && inputConnection != null) {
            getExitAnim.c(editorInfo, textView.getText());
        }
    }

    public int b() {
        return this.e.a();
    }

    public void b(int i, float f) {
        if (!getEnterTransition.d && !h()) {
            a(i, f);
        }
    }

    public void b(Context context, int i) {
        String string;
        ColorStateList e;
        ColorStateList e2;
        ColorStateList e3;
        setIconifiedByDefault seticonifiedbydefault = new setIconifiedByDefault(context, context.obtainStyledAttributes(i, setHasDecor$MediaBrowserCompat$MediaItem.dl));
        if (seticonifiedbydefault.d.hasValue(setHasDecor$MediaBrowserCompat$MediaItem.dt)) {
            d(seticonifiedbydefault.d.getBoolean(setHasDecor$MediaBrowserCompat$MediaItem.dt, false));
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (seticonifiedbydefault.d.hasValue(setHasDecor$MediaBrowserCompat$MediaItem.dh) && (e3 = seticonifiedbydefault.e(setHasDecor$MediaBrowserCompat$MediaItem.dh)) != null) {
                this.f218o.setTextColor(e3);
            }
            if (seticonifiedbydefault.d.hasValue(setHasDecor$MediaBrowserCompat$MediaItem.dk) && (e2 = seticonifiedbydefault.e(setHasDecor$MediaBrowserCompat$MediaItem.dk)) != null) {
                this.f218o.setLinkTextColor(e2);
            }
            if (seticonifiedbydefault.d.hasValue(setHasDecor$MediaBrowserCompat$MediaItem.dj) && (e = seticonifiedbydefault.e(setHasDecor$MediaBrowserCompat$MediaItem.dj)) != null) {
                this.f218o.setHintTextColor(e);
            }
        }
        if (seticonifiedbydefault.d.hasValue(setHasDecor$MediaBrowserCompat$MediaItem.dq)) {
            if (seticonifiedbydefault.d.getDimensionPixelSize(setHasDecor$MediaBrowserCompat$MediaItem.dq, -1) == 0) {
                this.f218o.setTextSize(0, 0.0f);
            }
        }
        a(context, seticonifiedbydefault);
        if (Build.VERSION.SDK_INT >= 26) {
            if (seticonifiedbydefault.d.hasValue(setHasDecor$MediaBrowserCompat$MediaItem.dv) && (string = seticonifiedbydefault.d.getString(setHasDecor$MediaBrowserCompat$MediaItem.dv)) != null) {
                this.f218o.setFontVariationSettings(string);
            }
        }
        seticonifiedbydefault.d.recycle();
        Typeface typeface = this.j;
        if (typeface != null) {
            this.f218o.setTypeface(typeface, this.m);
        }
    }

    public int c() {
        return this.e.e();
    }

    public void c(boolean z, int i, int i2, int i3, int i4) {
        if (!getEnterTransition.d) {
            d();
        }
    }

    public void d() {
        this.e.b();
    }

    public void d(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        this.e.b(i, i2, i3, i4);
    }

    public void d(ColorStateList colorStateList) {
        if (this.i == null) {
            this.i = new setImeOptions();
        }
        this.i.a = colorStateList;
        this.i.c = colorStateList != null;
        j();
    }

    public void d(PorterDuff.Mode mode) {
        if (this.i == null) {
            this.i = new setImeOptions();
        }
        this.i.d = mode;
        this.i.e = mode != null;
        j();
    }

    void d(WeakReference<TextView> weakReference, final Typeface typeface) {
        if (this.c) {
            this.j = typeface;
            final TextView textView = weakReference.get();
            if (textView == null) {
                return;
            }
            if (findFragmentByWho.F(textView)) {
                final int i = this.m;
                textView.post(new Runnable() { // from class: o.setDecorPadding.3
                    @Override // java.lang.Runnable
                    public void run() {
                        textView.setTypeface(typeface, i);
                    }
                });
                return;
            }
            textView.setTypeface(typeface, this.m);
        }
    }

    public void d(boolean z) {
        this.f218o.setAllCaps(z);
    }

    public void d(int[] iArr, int i) throws IllegalArgumentException {
        this.e.e(iArr, i);
    }

    public void e() {
        if (!(this.d == null && this.f == null && this.g == null && this.b == null)) {
            Drawable[] compoundDrawables = this.f218o.getCompoundDrawables();
            d(compoundDrawables[0], this.d);
            d(compoundDrawables[1], this.f);
            d(compoundDrawables[2], this.g);
            d(compoundDrawables[3], this.b);
        }
        if (this.h != null || this.a != null) {
            Drawable[] compoundDrawablesRelative = this.f218o.getCompoundDrawablesRelative();
            d(compoundDrawablesRelative[0], this.h);
            d(compoundDrawablesRelative[2], this.a);
        }
    }

    public void e(int i) {
        this.e.e(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0278  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void e(android.util.AttributeSet r10, int r11) {
        /*
        // Method dump skipped, instructions count: 1751
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setDecorPadding.e(android.util.AttributeSet, int):void");
    }

    public void f() {
        e();
    }

    public int[] g() {
        return this.e.c();
    }

    public boolean h() {
        return this.e.j();
    }

    public int i() {
        return this.e.h();
    }
}
