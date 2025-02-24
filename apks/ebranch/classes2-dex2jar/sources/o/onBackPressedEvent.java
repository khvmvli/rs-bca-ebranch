package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;
import o.onChooseTanggalJatuhTempo;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/onBackPressedEvent.class */
public final class onBackPressedEvent extends BitmapDrawable {
    private static final Paint e = new Paint();
    long a;
    boolean b;
    int c = 255;
    Drawable d;
    private final boolean f;
    private final onChooseTanggalJatuhTempo.write g;
    private final float j;

    private onBackPressedEvent(Context context, Bitmap bitmap, Drawable drawable, onChooseTanggalJatuhTempo.write write, boolean z, boolean z2) {
        super(context.getResources(), bitmap);
        this.f = z2;
        this.j = context.getResources().getDisplayMetrics().density;
        this.g = write;
        if (write != onChooseTanggalJatuhTempo.write.MEMORY && !z) {
            this.d = drawable;
            this.b = true;
            this.a = SystemClock.uptimeMillis();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(ImageView imageView, Context context, Bitmap bitmap, onChooseTanggalJatuhTempo.write write, boolean z, boolean z2) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).stop();
        }
        imageView.setImageDrawable(new onBackPressedEvent(context, bitmap, drawable, write, z, z2));
    }

    private static Path c(Point point, int i) {
        Point point2 = new Point(point.x + i, point.y);
        Point point3 = new Point(point.x, point.y + i);
        Path path = new Path();
        path.moveTo((float) point.x, (float) point.y);
        path.lineTo((float) point2.x, (float) point2.y);
        path.lineTo((float) point3.x, (float) point3.y);
        return path;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof AnimationDrawable) {
            ((AnimationDrawable) imageView.getDrawable()).start();
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!this.b) {
            draw(canvas);
        } else {
            float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.a)) / 200.0f;
            if (uptimeMillis >= 1.0f) {
                this.b = false;
                this.d = null;
                draw(canvas);
            } else {
                Drawable drawable = this.d;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                setAlpha((int) (((float) this.c) * uptimeMillis));
                draw(canvas);
                setAlpha(this.c);
            }
        }
        if (this.f) {
            Paint paint = e;
            paint.setColor(-1);
            canvas.drawPath(c(new Point(0, 0), (int) (this.j * 16.0f)), paint);
            paint.setColor(this.g.e);
            canvas.drawPath(c(new Point(0, 0), (int) (this.j * 15.0f)), paint);
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.c = i;
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        setAlpha(i);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        setColorFilter(colorFilter);
    }
}
