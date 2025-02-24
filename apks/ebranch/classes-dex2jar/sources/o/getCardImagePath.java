package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.Display;
import android.view.WindowManager;
import android.widget.ImageView;
import java.io.FileNotFoundException;
import java.io.IOException;
/* loaded from: classes-dex2jar.jar:o/getCardImagePath.class */
public class getCardImagePath extends setDropDownHorizontalOffset {
    private Bitmap a;
    private boolean d;
    private Uri k;
    private int m;
    private final Paint t = new Paint();
    private final float[] f = new float[9];
    private Rect s = new Rect();
    private final Matrix c = new Matrix();
    private final Matrix n = new Matrix();
    private final Matrix h = new Matrix();
    private float b = 16.0f;
    private float e = 9.0f;
    private RectF i = new RectF();
    private RectF l = new RectF();
    private Paint g = new Paint();

    /* renamed from: o  reason: collision with root package name */
    private Path f140o = new Path();
    private DashPathEffect j = new DashPathEffect(new float[]{40.0f, 10.0f}, 0.0f);

    public getCardImagePath(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    private void e() {
        float f;
        if (this.a == null) {
            this.a = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        }
        float width = (float) getWidth();
        float height = (float) getHeight();
        float width2 = (float) this.a.getWidth();
        float height2 = (float) this.a.getHeight();
        this.c.reset();
        float min = Math.min(Math.min(width / width2, 3.0f), Math.min(height / height2, 3.0f));
        float min2 = ((Math.min(width2, height2) * 4.0f) / 5.0f) * min;
        float f2 = this.b;
        if (f2 != 0.0f) {
            float f3 = this.e;
            if (f3 != 0.0f) {
                if (f2 > f3) {
                    f = (f3 * min2) / f2;
                } else {
                    min2 = (f2 * min2) / f3;
                    f = min2;
                }
                float f4 = (width - min2) / 2.0f;
                float f5 = (height - f) / 2.0f;
                this.l = new RectF(f4, f5, min2 + f4, f + f5);
                this.c.postScale(min, min);
                this.c.postTranslate((width - (width2 * min)) / 2.0f, (height - (height2 * min)) / 2.0f);
                this.n.reset();
                this.h.set(this.c);
                this.h.postConcat(this.n);
                setImageMatrix(this.h);
            }
        }
        f = min2;
        float f42 = (width - min2) / 2.0f;
        float f52 = (height - f) / 2.0f;
        this.l = new RectF(f42, f52, min2 + f42, f + f52);
        this.c.postScale(min, min);
        this.c.postTranslate((width - (width2 * min)) / 2.0f, (height - (height2 * min)) / 2.0f);
        this.n.reset();
        this.h.set(this.c);
        this.h.postConcat(this.n);
        setImageMatrix(this.h);
    }

    public final Bitmap c() {
        RectF rectF;
        Bitmap bitmap = null;
        if (getDrawable() != null) {
            if (this.l == null) {
                bitmap = null;
            } else {
                this.h.set(this.c);
                this.h.postConcat(this.n);
                Matrix matrix = this.h;
                Drawable drawable = getDrawable();
                if (drawable != null) {
                    this.i.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
                    matrix.mapRect(this.i);
                    rectF = this.i;
                } else {
                    rectF = null;
                }
                float f = this.l.left - rectF.left;
                float f2 = this.l.top - rectF.top;
                matrix.getValues(this.f);
                matrix.getValues(this.f);
                float sqrt = (float) Math.sqrt((double) (((float) Math.pow((double) this.f[0], 2.0d)) + ((float) Math.pow((double) this.f[3], 2.0d))));
                float f3 = f / sqrt;
                float f4 = (float) this.m;
                Rect rect = new Rect((int) (f3 * f4), (int) ((f2 / sqrt) * f4), (int) (((f + this.l.width()) / sqrt) * ((float) this.m)), (int) (((f2 + this.l.height()) / sqrt) * ((float) this.m)));
                try {
                    BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(getContext().getContentResolver().openInputStream(this.k), false);
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inSampleSize = this.m;
                    bitmap = newInstance.decodeRegion(rect, options);
                } catch (FileNotFoundException | IOException | OutOfMemoryError e) {
                    bitmap = null;
                }
            }
        }
        return bitmap;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        onDraw(canvas);
        e();
        this.g.setStrokeWidth(4.0f);
        this.g.setStyle(Paint.Style.STROKE);
        this.t.setARGB(178, 50, 50, 50);
        this.f140o.reset();
        this.f140o.addRect(this.l.left, this.l.top, this.l.right, this.l.bottom, Path.Direction.CW);
        if (this.d) {
            this.g.setColor(0);
            this.g.setPathEffect(null);
            getDrawingRect(this.s);
            canvas.clipPath(this.f140o, Region.Op.DIFFERENCE);
            canvas.drawRect(this.s, this.t);
        } else {
            this.g.setColor(-1);
            this.g.setPathEffect(this.j);
        }
        canvas.drawRect(this.l, this.g);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        onMeasure(i, i2);
    }

    public void setBackgroundTransparent(boolean z) {
        this.d = z;
        invalidate();
    }

    public void setImageUri(Uri uri) {
        this.k = uri;
        try {
            Context context = getContext();
            BitmapFactory.Options options = new BitmapFactory.Options();
            int i = 1;
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(context.getContentResolver().openInputStream(uri), null, options);
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            int sqrt = (int) Math.sqrt(Math.pow((double) point.x, 2.0d) + Math.pow((double) point.y, 2.0d));
            while (true) {
                if (options.outHeight / i <= sqrt && options.outWidth / i <= sqrt) {
                    break;
                }
                i <<= 1;
            }
            this.m = i;
            Bitmap decodeStream = BitmapFactory.decodeStream(getContext().getContentResolver().openInputStream(this.k));
            Bitmap bitmap = this.a;
            this.a = decodeStream;
            setImageBitmap(decodeStream);
            if (bitmap != null) {
                bitmap.recycle();
            }
            e();
        } catch (Exception e) {
        }
    }
}
