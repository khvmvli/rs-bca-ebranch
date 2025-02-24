package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
/* loaded from: classes-dex2jar.jar:o/setPrecomputedText.class */
class setPrecomputedText extends setPrompt {
    private Drawable b;
    private final SeekBar f;
    private ColorStateList e = null;
    private PorterDuff.Mode d = null;
    private boolean a = false;
    private boolean c = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setPrecomputedText(SeekBar seekBar) {
        super(seekBar);
        this.f = seekBar;
    }

    private void a() {
        Drawable drawable = this.b;
        if (drawable == null) {
            return;
        }
        if (this.a || this.c) {
            Drawable h = getInsetsForType.h(drawable.mutate());
            this.b = h;
            if (this.a) {
                getInsetsForType.e(h, this.e);
            }
            if (this.c) {
                getInsetsForType.d(this.b, this.d);
            }
            if (this.b.isStateful()) {
                this.b.setState(this.f.getDrawableState());
            }
        }
    }

    void a(Drawable drawable) {
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.b = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f);
            getInsetsForType.c(drawable, findFragmentByWho.k(this.f));
            if (drawable.isStateful()) {
                drawable.setState(this.f.getDrawableState());
            }
            a();
        }
        this.f.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setPrompt
    public void a(AttributeSet attributeSet, int i) {
        a(attributeSet, i);
        Context context = this.f.getContext();
        setIconifiedByDefault seticonifiedbydefault = new setIconifiedByDefault(context, context.obtainStyledAttributes(attributeSet, setHasDecor$MediaBrowserCompat$MediaItem.U, i, 0));
        SeekBar seekBar = this.f;
        findFragmentByWho.e(seekBar, seekBar.getContext(), setHasDecor$MediaBrowserCompat$MediaItem.U, attributeSet, seticonifiedbydefault.d, i, 0);
        Drawable a = seticonifiedbydefault.a(setHasDecor$MediaBrowserCompat$MediaItem.Z);
        if (a != null) {
            this.f.setThumb(a);
        }
        a(seticonifiedbydefault.d(setHasDecor$MediaBrowserCompat$MediaItem.ac));
        if (seticonifiedbydefault.d.hasValue(setHasDecor$MediaBrowserCompat$MediaItem.aa)) {
            this.d = setOnFitSystemWindowsListener.e(seticonifiedbydefault.d.getInt(setHasDecor$MediaBrowserCompat$MediaItem.aa, -1), this.d);
            this.c = true;
        }
        if (seticonifiedbydefault.d.hasValue(setHasDecor$MediaBrowserCompat$MediaItem.Y)) {
            this.e = seticonifiedbydefault.e(setHasDecor$MediaBrowserCompat$MediaItem.Y);
            this.a = true;
        }
        seticonifiedbydefault.d.recycle();
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        Drawable drawable = this.b;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f.getDrawableState())) {
            this.f.invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(Canvas canvas) {
        if (this.b != null) {
            int max = this.f.getMax();
            int i = 1;
            if (max > 1) {
                int intrinsicWidth = this.b.getIntrinsicWidth();
                int intrinsicHeight = this.b.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight / 2;
                }
                this.b.setBounds(-i2, -i, i2, i);
                float width = ((float) ((this.f.getWidth() - this.f.getPaddingLeft()) - this.f.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f.getPaddingLeft(), (float) (this.f.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    this.b.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
