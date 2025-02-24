package o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setAutoSizeTextTypeWithDefaults.class */
public final class setAutoSizeTextTypeWithDefaults extends Drawable {
    final setSupportButtonTintList a;

    public setAutoSizeTextTypeWithDefaults(setSupportButtonTintList setsupportbuttontintlist) {
        this.a = setsupportbuttontintlist;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!this.a.b) {
            if (this.a.e != null) {
                this.a.e.draw(canvas);
            }
            if (this.a.c != null && this.a.d) {
                this.a.c.draw(canvas);
            }
        } else if (this.a.a != null) {
            this.a.a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.a.b) {
            if (this.a.a != null) {
                this.a.a.getOutline(outline);
            }
        } else if (this.a.e != null) {
            this.a.e.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
