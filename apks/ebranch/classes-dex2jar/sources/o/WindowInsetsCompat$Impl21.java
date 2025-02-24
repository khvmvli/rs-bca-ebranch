package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
/* loaded from: classes-dex2jar.jar:o/WindowInsetsCompat$Impl21.class */
public final class WindowInsetsCompat$Impl21 extends Drawable.ConstantState {
    ColorStateList a;
    Drawable.ConstantState b;
    int c;
    PorterDuff.Mode d;

    public WindowInsetsCompat$Impl21(WindowInsetsCompat$Impl21 windowInsetsCompat$Impl21) {
        this.a = null;
        this.d = setFillViewport.b;
        if (windowInsetsCompat$Impl21 != null) {
            this.c = windowInsetsCompat$Impl21.c;
            this.b = windowInsetsCompat$Impl21.b;
            this.a = windowInsetsCompat$Impl21.a;
            this.d = windowInsetsCompat$Impl21.d;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        int i = this.c;
        Drawable.ConstantState constantState = this.b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new WindowInsetsCompat$Impl28(this, resources);
    }
}
