package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import com.bumptech.glide.Glide;
import java.util.List;
import o.getPivotY;
import o.getTimeZone;
/* loaded from: classes-dex2jar.jar:o/getProvince.class */
public class getProvince extends Drawable implements getTimeZone$MediaBrowserCompat$CustomActionResultReceiver, Animatable, getPivotY {
    private boolean a;
    private List<getPivotY.IconCompatParcelizer> b;
    private boolean c;
    public final read d;
    private Rect e;
    private boolean f;
    private int g;
    private boolean h;
    private boolean i;
    private int j;
    private Paint l;

    /* loaded from: classes-dex2jar.jar:o/getProvince$read.class */
    public static final class read extends Drawable.ConstantState {
        public final getTimeZone a;

        read(getTimeZone gettimezone) {
            this.a = gettimezone;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new getProvince(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return newDrawable();
        }
    }

    public getProvince(Context context, setCategoryEn setcategoryen, getReservationDate<Bitmap> getreservationdate, int i, int i2, Bitmap bitmap) {
        this(new read(new getTimeZone(Glide.e(context), setcategoryen, i, i2, getreservationdate, bitmap)));
    }

    getProvince(read read2) {
        this.h = true;
        this.g = -1;
        if (read2 != null) {
            this.d = read2;
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    private void a() {
        if (!this.a) {
            if (this.d.a.h.f() != 1) {
                if (!this.f) {
                    this.f = true;
                    getTimeZone gettimezone = this.d.a;
                    if (gettimezone.j) {
                        throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
                    } else if (!gettimezone.d.contains(this)) {
                        boolean isEmpty = gettimezone.d.isEmpty();
                        gettimezone.d.add(this);
                        if (isEmpty && !gettimezone.g) {
                            gettimezone.g = true;
                            gettimezone.j = false;
                            gettimezone.d();
                        }
                    } else {
                        throw new IllegalStateException("Cannot subscribe twice in a row");
                    }
                } else {
                    return;
                }
            }
            invalidateSelf();
            return;
        }
        throw new IllegalArgumentException("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
    }

    private void d() {
        this.f = false;
        getTimeZone gettimezone = this.d.a;
        gettimezone.d.remove(this);
        if (gettimezone.d.isEmpty()) {
            gettimezone.g = false;
        }
    }

    @Override // o.getTimeZone$MediaBrowserCompat$CustomActionResultReceiver
    public final void b() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        getTimeZone.write write = this.d.a.a;
        if ((write != null ? write.d : -1) == this.d.a.h.f() - 1) {
            this.j++;
        }
        int i = this.g;
        if (i != -1 && this.j >= i) {
            List<getPivotY.IconCompatParcelizer> list = this.b;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.b.get(i2).a(this);
                }
            }
            stop();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (!this.a) {
            if (this.c) {
                int intrinsicWidth = getIntrinsicWidth();
                int intrinsicHeight = getIntrinsicHeight();
                Rect bounds = getBounds();
                if (this.e == null) {
                    this.e = new Rect();
                }
                Gravity.apply(setHasDecor$MediaBrowserCompat$MediaItem.aJ, intrinsicWidth, intrinsicHeight, bounds, this.e);
                this.c = false;
            }
            getTimeZone gettimezone = this.d.a;
            getTimeZone.write write = gettimezone.a;
            Bitmap bitmap = write != null ? write.e : gettimezone.e;
            if (this.e == null) {
                this.e = new Rect();
            }
            Rect rect = this.e;
            if (this.l == null) {
                this.l = new Paint(2);
            }
            canvas.drawBitmap(bitmap, (Rect) null, rect, this.l);
        }
    }

    public final void e() {
        this.a = true;
        getTimeZone gettimezone = this.d.a;
        gettimezone.d.clear();
        Bitmap bitmap = gettimezone.e;
        if (bitmap != null) {
            gettimezone.c.b(bitmap);
            gettimezone.e = null;
        }
        gettimezone.g = false;
        getTimeZone.write write = gettimezone.a;
        if (write != null) {
            gettimezone.n.a(write);
            gettimezone.a = null;
        }
        getTimeZone.write write2 = gettimezone.f;
        if (write2 != null) {
            gettimezone.n.a(write2);
            gettimezone.f = null;
        }
        getTimeZone.write write3 = gettimezone.f160o;
        if (write3 != null) {
            gettimezone.n.a(write3);
            gettimezone.f160o = null;
        }
        gettimezone.h.d();
        gettimezone.j = true;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.d.a.i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.d.a.m;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        onBoundsChange(rect);
        this.c = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.l == null) {
            this.l = new Paint(2);
        }
        this.l.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.l == null) {
            this.l = new Paint(2);
        }
        this.l.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        if (!this.a) {
            this.h = z;
            if (!z) {
                d();
            } else if (this.i) {
                a();
            }
            return setVisible(z, z2);
        }
        throw new IllegalArgumentException("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.i = true;
        this.j = 0;
        if (this.h) {
            a();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.i = false;
        d();
    }
}
